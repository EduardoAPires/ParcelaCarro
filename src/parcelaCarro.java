public class parcelaCarro {
    public static void main(String[] args) {
        float valorCarro = 30000F;

        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro/parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela "+parcela+" R$"+valorParcela);
            }else{
                break;
            }
        }
    }
}
