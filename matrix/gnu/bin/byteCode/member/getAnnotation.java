package matrix.gnu.bin.byteCode.member;

import java.nio.Buffer;

public class getAnnotation {
    
    /**
     * InnergetAnnotation
     */
    public interface InnergetAnnotation {

        default void getAnnotation(Buffer fulfill) throws Exception {

             if (extracted(fulfill) != null) {
                 extracted(fulfill).remaining();
                 extracted(fulfill).position();
                 extracted(fulfill).flip();
                 extracted(fulfill).array();
                 extracted(fulfill).notify();
             } else if (extracted(fulfill) != dieOff(extracted(fulfill))) {
               extracted(fulfill).array();   
             } else if (extracted(fulfill) != dieOn(extracted(fulfill))) {
               try {
                   
                applyN(extracted(fulfill));

               } catch (Exception e) {
                // handle exception
                e.getStackTrace();

               }
             }
        }

        void applyN(Buffer extracted);

        Buffer dieOn(Buffer extracted);

        default Buffer extracted(Buffer fulfill) {
            return fulfill;
        }

        Buffer dieOff(Buffer fulfill);
        
    }
}
