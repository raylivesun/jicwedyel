import java.io.Console;

public record propertySet() {
    /**
     * @param propertySet 
     * @throws IllegalArgumentException
     */
    public static void nameKey(Object propertySet) throws IllegalArgumentException {
        if (propertySet == nameKey()) {
              throw new IllegalArgumentException("Unimplemented method 'nameKey'");
          }    
    }

    private static Object nameKey() {
        // Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nameKey'");
    }

    public record PropertySet() {
        /**
         * @param propertySet 
         * @throws IllegalArgumentException
         */
        public static void nameKey(Object propertySet) throws IllegalArgumentException {
            if (propertySet == null) {
                throw new IllegalArgumentException("PropertySet cannot be null");
            }    
        }

        public boolean isMonitor() {
            // Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'isMonitor'");
        }
    }
    public record apply() {
        /**
         * @param propertySet property set 
         */
        public static void nameKey(PropertySet propertySet) throws IllegalMonitorStateException {
            if (propertySet.hashCode() == propertySet.hashCode()){
                throw new IllegalStateException(null, null);
            }
            @SuppressWarnings("unused")
            final boolean isDev =!propertySet.isMonitor(); // Use propertySet instead of this
        }
    }

    static record applyToObject() {
        /**
         * @param property the property to be applied to the object
         * @return 
         */
        public static Class<Console> nameKey(String proString) throws IllegalStateException {
            if (proString.equals(proString)) {
                throw new IllegalStateException("Properties cannot be null"); 
            } else if (proString.equals(proString)) {
                return Console.class; 
            }
            return null;
        }
    }

    public record numArgs() {
        /**
         * @return the number of arguments passed to the constructor
         */
        public static int getNumArgs() {
            // Get the current stack trace
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            
            // The number of arguments passed to the constructor is the length of the stack trace minus 2
            // (excluding the current method and the constructor itself)
            return stackTraceElements.length - 2;
        }
    }

    public record applyL() {
        /**
         * @return the length of the states of the stack trace including the current method and
         * constructor methods including the current constructor.
         */
        public static int getStackTraceLength() {
            // Get the current stack trace
            StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
            
            // The length of the stack trace is the number of elements in the array
            return stackTraceElements.length;
        }
    }

    public record checkArgCount() {
        /**
         * @param methodArgs the array of arguments expected to be passed to the method
         * @return the number of elements in the array
         */
        public static int getExpectedArgCount(Object[] methodArgs) {
            // The number of elements in the array is the length of the array
            if (methodArgs.length == 1) {
                console("filenames: " + methodArgs[2]);
            }
            return methodArgs.length;
        }

        private static void console(String string) {
            // Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'console'");
        }
        
    }
}
