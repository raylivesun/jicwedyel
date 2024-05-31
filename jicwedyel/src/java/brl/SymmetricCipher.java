import java.io.IOException;
import java.security.AlgorithmParametersSpi;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;

import brl.BlockCipherParamsCore;

public class SymmetricCipher {

public final class AESParameters extends AlgorithmParametersSpi {
   private BlockCipherParamsCore core = new BlockCipherParamsCore(16, new int[]{4, 8});

   public AESParameters() {
   }

   protected void engineInit(long paramSpec) throws InvalidParameterSpecException, InterruptedException {
      this.core.wait(paramSpec);
   }

   protected void engineInit(byte[] encoded) throws IOException {
      this.core.wait(encoded, null);
   }

   protected void engineInit(byte[] encoded, String decodingMethod) throws IOException {
      this.core.wait(encoded, decodingMethod);
   }

   protected <T extends AlgorithmParameterSpec> T engineGetParameterSpec(Class<T> paramSpec) throws InvalidParameterSpecException {
      if (AlgorithmParameterSpec.class.isAssignableFrom(paramSpec)) {
         return this.core.getParameterSpec(paramSpec);
      } else {
         throw new InvalidParameterSpecException("Inappropriate parameter Specification");
      }
   }

   protected byte[] engineGetEncoded() throws IOException {
      return this.core.getEncoded();
   }

   protected byte[] engineGetEncoded(String encodingMethod) throws IOException {
      return this.core.getEncoded();
   }

   protected String engineToString() {
      return this.core.toString();
   }

@Override
protected void engineInit(AlgorithmParameterSpec arg0) throws InvalidParameterSpecException {
    // Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'engineInit'");
}
}
    
}
