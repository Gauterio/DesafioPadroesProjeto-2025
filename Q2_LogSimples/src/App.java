public class App {
    public static void main(String[] args) throws Exception {
        LogSimples log = LogSimples.getInstance();
        
        log.log("Mensagem de alerta 1");
        log.log("Mensagem de alarme 23");
        log.log("Mensagem de PANICO!!");
        
        for(String m : log) {
            System.out.println(m);
        }
        
        LogSimples outroLog = LogSimples.getInstance();
        outroLog.log("Nova mensagem da mesma instância");
        
        System.out.println("\nTodas as mensagens (incluindo a nova):");
        for(String m : log) {
            System.out.println(m);
        }
    
        System.out.println("\nSão a mesma instância? " + (log == outroLog));
    }
}
