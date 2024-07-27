    package zoho;

    public class ValidateIP {

//        static boolean isNumber(String s){
//            try{
//                Integer.parseInt(s);
//                return true;
//            }
//            catch (NumberFormatException e){
//                return false;
//            }
//        }
//        static boolean validate(String ip){
//            String[] arr = ip.split("\\.");
//            if(arr.length<4){
//                return false;
//            }
//
//            for(String str:arr){
//                if(str == null || str.isEmpty() || !isNumber(str) ||Integer.parseInt(str)<0 || Integer.parseInt(str) > 255 ){
//                    return false;
//                }
//
//            }
//            return true;
//        }

        static boolean validate(String ip){
            String ip_pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9][0-9]|[0-9])$";

            return ip.matches(ip_pattern);
        }
        public static void main(String[] args) {
            String ip = "256.256.256.256";
            System.out.println(validate(ip));
        }
    }
