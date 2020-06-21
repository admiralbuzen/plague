public class Main {

    // At least two constants start with STAR
//    enum Secret {
//        STAR, CRASH, START;
//}

        public static void main(String[] args) {

            Secret[] arr = Secret.values();
            int count = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i].toString().startsWith("STAR")) {
                    count++;
                }

            }
            System.out.println(count);
        }
        }






