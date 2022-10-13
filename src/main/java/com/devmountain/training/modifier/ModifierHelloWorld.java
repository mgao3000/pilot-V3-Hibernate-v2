package com.devmountain.training.modifier;

public class ModifierHelloWorld {

    public String pubString;
    public int pubInt;

    private String privateString;
    private int privateInt;

    protected String protectedString;
    protected int protectedInt;

    String packageString;
    int packageInt;

    public ModifierHelloWorld()
    {
        System.out.println("Print out from ModifierHelloWorld public constructor");
    }

    public ModifierHelloWorld(String dummy) {
        System.out.println("Print out from ModifierHelloWorld public constructor with input value = "
                + dummy);
    }

//    private ModifierHelloWorld() {
//        System.out.println("Print out from ModifierHelloWorld private constructor");
//    }
//
//    ModifierHelloWorld() {
//        System.out.println("Print out from ModifierHelloWorld defailt(package) constructor");
//    }
//
//    protected ModifierHelloWorld() {
//        System.out.println("Print out from ModifierHelloWorld protected constructor");
//    }

    void displayFromDeafultModifier() {
        System.out.println("this is a print from a method with default modifier");
    }

    protected void displayFromProtectedModifier() {
        System.out.println("this is a print from a method with protected modifier");
    }

    private void displayFromPrivateModifier() {
        System.out.println("this is a print from a method with private modifier");
    }

    public void displayFromPublicModifier() {
        System.out.println("this is a print from a method with public modifier");
    }

    public String getMeAStringPublic() {
        return "Hi";
    }

    String defaultPackageMethod() {
        return "dafault";
    }

}
