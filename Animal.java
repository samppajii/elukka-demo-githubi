

public class Animal {
    public String laji;
    public String color;
    public int pituus;

    public void naytaTiedot() {
        System.out.println("Eläin: " + color + " " + laji);
        System.out.println("pituus: " + pituus + " cm");
        
    }

    // public void kiihdyta() {
    //     if (bensanMaara > 0) {
    //         bensanMaara--;
    //         System.out.println("Auto kiihtyy");

    //     } else {
    //         System.out.println("Tankkaa ensin.");
            
    //     }


    // }

//     public void tankkaa(int maara){
//         if (maara > 0) {

//             System.out.println("Tankissa ennen tankkausta: " + bensanMaara);

//             bensanMaara += maara;

//             System.out.println("Tankkaus: " + maara);
//             System.out.println("Tankissa tankkauksen jälkeen: " + bensanMaara);
            
//         } else {
//             System.out.println("Tankattavan määrän pitää olla positiivinen");
//         }

//     }
}
