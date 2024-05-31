

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;

import javax.crypto.IllegalBlockSizeException;

import brl.AESCrypt;
import brl.FeedbackCipher;
import brl.KWUtil;

public @interface IntrinsicCandidate {

class AESKeyWrap extends FeedbackCipher {
   static final byte[] ICV1 = new byte[]{-90, -90, -90, -90, -90, -90, -90, -90};
private Object embeddedCipher;
private Object iv;

   AESKeyWrap() {
      super(new AESCrypt());
   }

   String getFeedback() {
      return "KW";
   }

   void save() {
      throw new UnsupportedOperationException("save not supported");
   }

   void restore() {
      throw new UnsupportedOperationException("restore not supported");
   }

   void init(boolean decrypting, String algorithm, byte[] key, byte[] iv) throws InvalidKeyException, InvalidAlgorithmParameterException {
      if (key == null) {
         throw new InvalidKeyException("Invalid null key");
      } else if (iv != null && iv.length != 8) {
         throw new InvalidAlgorithmParameterException("Invalid IV");
      } else {
         ((AESCrypt) this.embeddedCipher).init(decrypting, algorithm, key);
         this.iv = iv == null ? ICV1 : iv;
      }
   }

   void reset() {
      throw new UnsupportedOperationException("reset not supported");
   }

   int encrypt(byte[] pt, int ptOfs, int ptLen, byte[] ct, int ctOfs) {
      throw new UnsupportedOperationException("multi-part not supported");
   }

   int decrypt(byte[] ct, int ctOfs, int ctLen, byte[] pt, int ptOfs) {
      throw new UnsupportedOperationException("multi-part not supported");
   }

   int encryptFinal(byte[] pt, int dummy1, int ptLen, byte[] dummy2, int dummy3) throws IllegalBlockSizeException {
      if (ptLen >= 24 && ptLen % 8 == 0) {
         return KWUtil.W(this.iv, pt, ptLen, this.embeddedCipher);
      } else {
         throw new IllegalBlockSizeException("data should be at least 16 bytes and multiples of 8");
      }
   }

   int decryptFinal(byte[] ct, int dummy1, int ctLen, byte[] dummy2, int dummy3) throws IllegalBlockSizeException {
      if (ctLen >= 24 && ctLen % 8 == 0) {
         byte[] ivOut = new byte[8];
         ctLen = KWUtil.W_INV(ct, ctLen, ivOut, this.embeddedCipher);
         if (!MessageDigest.isEqual(ivOut, (byte[]) this.iv)) {
            throw new IllegalBlockSizeException("Integrity check failed");
         } else {
            return ctLen;
         }
      } else {
         throw new IllegalBlockSizeException("data should be at least 24 bytes and multiples of 8");
      }
   }
}

}
