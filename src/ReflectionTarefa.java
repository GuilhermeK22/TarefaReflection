import java.lang.annotation.Annotation;

public class ReflectionTarefa {
    public static void main(String[] args) {

        ReflectionExecute();
    }
    private static Object ReflectionExecute() {
        ClasseTabela tab = new ClasseTabela();
        Annotation[] annotations = tab.getClass().getAnnotations();

        if (tab.getClass().isAnnotationPresent(Tabela.class)) {
            Tabela refl = tab.getClass().getAnnotation(Tabela.class);
            System.out.println("O nome da tabela é: " + refl.nometabela() + "!");
        }
        return null;
    }
}
