public class Tekst {
    private String[] tekstLinjer = new String[10];

    public void tilføj(String streng){
        for(int i = 0; i < tekstLinjer.length; i++){
            if(tekstLinjer[i] == null || tekstLinjer[i].isEmpty()){
                tekstLinjer[i] = streng;
                break;
            }
        }
    }

    public int findAntalUnikke(){
        int count = 0;
        for(int i = 0; i < tekstLinjer.length; i++){
            if(tekstLinjer[i] != null && !tekstLinjer[i].isEmpty()){
                int occurences = 0;
                for(int j = 0; j < tekstLinjer.length; j++){
                    if(tekstLinjer[j] != null && j != i && tekstLinjer[j].equals(tekstLinjer[i])) {
                        occurences++;
                        break;
                    }
                }
                if(occurences == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public String[] getTekstLinjer() {
        return tekstLinjer;
    }
}
