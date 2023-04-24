package org.natalin.entidades;

    import java.util.List;

    public class Cliente {

        private String nombre;
        private String apellido;
        private String documento;
        //private List<Cuenta> cuentas;


        public Cliente() {
        }

        public Cliente(String nombre, String apellido, String documento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.documento = documento;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getDocumento() {
            return documento;
        }

        public void setDocumento(String documento) {
            this.documento = documento;
        }

        @Override
        public String toString() {
            return "nombre='" + nombre + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", documento='" + documento + "'";
        }
    }
