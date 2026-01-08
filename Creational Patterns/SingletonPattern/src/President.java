public class President {
//    private static President presidentInstance;
//
//    private President(){
//        System.out.println("President est elu");
//    }
//
//    public static President getInstance(){
//        if (presidentInstance == null){
//            presidentInstance = new President();
//            return presidentInstance;
//        }
//        return presidentInstance;
//    }
    //another method
    private static final President presidentInstance;
    private President(){
        System.out.println("President est elu");
    }
    static {
        presidentInstance = new President();
    }
    public static synchronized President getInstance(){ // we add synchronized if we working in application multi threads
        return presidentInstance;
    }
}
