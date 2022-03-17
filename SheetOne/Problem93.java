public class Problem93{
    public static void main (String[]args){
        String role="Admin";
        String rule="moderator";
        if (role == "Admin") {
            System.out.println("You Are Admin");

        }else if(role=="Moderator"){
            System.out.println("You are a Moderator");
        }else{
            System.out.println("You are a Guest");
        }
        //    Using switch Statement
        switch(rule){
            case "Admin":
                System.out.println("You Have an access");
                break;
            case "moderator":
                System.out.println("You Have a high Access on System");
                break;
            default:
                System.out.println("You Don't Have an access on system");
    }

    }
}
