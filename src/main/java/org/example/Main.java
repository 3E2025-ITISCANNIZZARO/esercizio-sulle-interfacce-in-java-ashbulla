package gioco;



public class main {
    public static void main(String[] args){
        superEroe s1=new superEroe("superMan");
        Vampiro v1=new Vampiro("dracula");
        Licantropo l1=new Licantropo("Caparezza");
        s1.Combattimento();
        s1.Combattimento();
        s1.Combattimento();
        v1.morso();
        l1.attacco();
        l1.attacco();
        System.out.println("la forza dei personaggi ora è: \n supereroe: "+s1.getForza()+"\n vampiro: "+v1.getForza()+"\n licantropo: "+l1.getForza());
    }
}
