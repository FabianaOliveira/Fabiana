package Servlet;


import Classe.Usuario;
public class VerLogin {
    
        public boolean verificaLogin(Usuario usuario) {

        return "fabi".equals(usuario.getUsuario()) && "fabi".equals(usuario.getSenha());
    }
}
