package com.oracle.oci.identity;

/**
 * @author Amit Chawla
 **/
public class SpellChecker implements ISpellChecker{
//    private String dbUrl;
//    private String dbUser;
//    private int timeout;
//
//    @Inject
//    public SpellChecker(String dbUrl, String dbUser, int timeout) {
//        this.dbUrl = dbUrl;
//        this.dbUser = dbUser;
//        this.timeout = timeout;
//    }

    @Override
    public void checkSpelling() {
        System.out.println("Checking spelling...");
//        System.out.println(dbUrl);
//        System.out.println(dbUser);
//        System.out.println(timeout);
    }
}
