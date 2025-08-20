public class App {
    public static void main(String[] args) throws Exception {
        
        String email = "bernardo.copstein@pucrs.br";
        var validador = new Validadorr();

        if (validador.valida(Validadorr.Tipo.EMAIL, email)){
            System.out.println(email+" é um email válido!");
        }else{
            System.out.println(email+" não é um email válido!");
        }
    }
}
