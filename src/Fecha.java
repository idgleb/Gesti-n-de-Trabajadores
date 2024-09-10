import javax.swing.*;

public class Fecha {
    private int dia;
    private int mes;
    private int ano;

    public Fecha() {
        this.ano = setAno();
        this.mes = setMes();
        this.dia = dia;
    }
    public int setAno() {
        String anoStr ="";
        do{
            anoStr = JOptionPane.showInputDialog(null, "Ingresa el ano");
        }while (!isAno(anoStr));
        int ano = Integer.parseInt(anoStr);
        return ano;
    }

    public int setMes() {
        String mesStr ="";
        do{
            mesStr = JOptionPane.showInputDialog(null, "Ingresa el mes");
        }while (!isMes(mesStr));
        int mes = Integer.parseInt(mesStr);
        return mes;
    }

    public boolean setDia(int dia) {
        if (dia < 1 || dia > 31) {
            return false;

        }
        this.dia = dia;
        return true;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }

    public static boolean isAno(String anoStr){
        if (anoStr.isEmpty()) {
            return false;
        }else {
            for (int i = 0; i < anoStr.length(); i++) {
                if (anoStr.charAt(i) < '0' || anoStr.charAt(i) > '9') return false;
            }
        }
        return true;
    }

    public static boolean isMes(String mesStr){
        if (mesStr.isEmpty()) {
            return false;
        }else {
            for (int i = 0; i < mesStr.length(); i++) {
                if (mesStr.charAt(i) < '0' || mesStr.charAt(i) > '9') return false;
            }
            int mes = Integer.parseInt(mesStr);
            if (mes < 1 || mes > 12) {
                return false;
            }
        }
        return true;
    }


}
