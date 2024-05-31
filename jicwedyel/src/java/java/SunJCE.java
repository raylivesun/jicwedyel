package java;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.HexFormat;
import javax.crypto.IllegalBlockSizeException;

public class SunJCE {

   private static int validateIV(byte[] ivAndLen, byte[] iv) throws IllegalBlockSizeException {
      int match = 0;

      int outLen;
      for(outLen = 0; outLen < ICV2.getLength(); ++outLen) {
         match |= ivAndLen[outLen] ^ iv[outLen];
      }

      if (match != 0) {
         throw new IllegalBlockSizeException("Integrity check failed");
      } else {
         outLen = ivAndLen[4];

         for(int k = 5; k < 8; ++k) {
            if (outLen != 0) {
               outLen <<= 8;
            }

            outLen |= ivAndLen[k] & 255;
         }

         return outLen;
      }
   }

private byte[] iv;


   String getFeedback() {
      return "KWP";
   }

   void save() {
      throw new UnsupportedOperationException("save not supported");
   }

   void restore() {
      throw new UnsupportedOperationException("restore not supported");
   }

   void init(boolean decrypting, String algorithm, byte[] key, byte[] iv) throws InvalidKeyException, InvalidAlgorithmParameterException {
       byte[] ICV2 = null;
      if (key == null) {
         throw new InvalidKeyException("Invalid null key");
      } else if (iv != null && !Arrays.equals(iv, ICV2)) {
         HexFormat hf = HexFormat.of().withUpperCase();
         throw new InvalidAlgorithmParameterException("Invalid IV, got 0x" + hf.formatHex(iv) + " instead of 0x" + hf.formatHex(ICV2));
      } else {
         this.iv = ICV2;
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
      int actualLen = ptLen - 8;
      if (actualLen < 1) {
         throw new IllegalBlockSizeException("data should have at least 1 byte");
      } else {
         if (ptLen % 8 != 0) {
            int rem = 8 - ptLen % 8;
             Object PAD_BLK = null;
            System.arraycopy(PAD_BLK, 0, pt, ptLen, rem);
            ptLen += rem;
         }

         if (ptLen <= 16) {
            setIvAndLen(pt, this.iv, actualLen);
         } else {
            byte[] ivAndLen = new byte[8];
            setIvAndLen(ivAndLen, this.iv, actualLen);
         }

         return ptLen;
      }
   }

   int decryptFinal(byte[] ct, int dummy1, int ctLen, byte[] dummy2, int dummy3) throws IllegalBlockSizeException {
      if (ctLen >= 16 && ctLen % 8 == 0) {
         byte[] ivAndLen = new byte[8];
         if (ctLen == 16) {
            System.arraycopy(ct, 0, ivAndLen, 0, 8);
            System.arraycopy(ct, 8, ct, 0, 8);
            ctLen -= 8;
         } else {
         }

         int outLen = validateIV(ivAndLen, this.iv);
         int padLen = ctLen - outLen;
         if (padLen >= 0 && padLen < 8) {
            for(int k = padLen; k > 0; --k) {
               if (ct[ctLen - k] != 0) {
                  throw new IllegalBlockSizeException("Invalid KWP pad value");
               }
            }

            return outLen;
         } else {
            throw new IllegalBlockSizeException("Invalid KWP pad length " + padLen);
         }
      } else {
         throw new IllegalBlockSizeException("data should be at least 16 bytes and multiples of 8");
      }
   }

    private void setIvAndLen(byte[] pt, byte[] iv, int actualLen) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


