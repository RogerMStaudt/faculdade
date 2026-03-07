public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Atribuindo a data padrão 01/01/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean verificaAnoBissexto() {
        if (ano % 4 == 0 || ano % 400 == 0) {
            return false;
        } else {
            return true;
        }
    }

    private int diasNoMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return verificaAnoBissexto() ? 29 : 28;
            default:
                return 0;
        }
    }

    public boolean validaData (int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > diasNoMes(mes)) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Data: " + this.dia + "/" + this.mes + "/" + this.ano;
    }
}
