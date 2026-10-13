public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setUsername("admin");
        u1.setCorreo("admin@correo.com");
        u1.setNivel(5);
        u1.activar();

        System.out.println("Username: " + u1.getUsername());
        System.out.println("Correo: " + u1.getCorreo());
        System.out.println("Nivel: " + u1.getNivel());
        System.out.println("Activo: " + u1.isActivo());

        // Pruebas con datos incorrectos
        u1.setUsername("");
        u1.setCorreo("");
        u1.setNivel(-3);
        System.out.println("--- Después de datos incorrectos ---");
        System.out.println("Username: " + u1.getUsername());
        System.out.println("Correo: " + u1.getCorreo());
        System.out.println("Nivel: " + u1.getNivel());

        u1.desactivar();
        System.out.println("Activo después de desactivar(): " + u1.isActivo());
    }
}
