import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacao {

    public boolean validaNome(String nome) {
        var pattern = Pattern.compile("[a-zA-Z]{5,100}");
        Matcher matcher = pattern.matcher(nome);
        return matcher.find();
    }

    public boolean validaSenha(String senha) {
        var pattern = Pattern.compile("[a-zA-Z0-9$*&@#]{8,}");
        Matcher matcher = pattern.matcher(senha);
        return matcher.find();
    }

    public boolean validaCpf(String cpf) {
        var pattern = Pattern.compile("([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})");
        Matcher matcher = pattern.matcher(cpf);
        return matcher.find();}


}
