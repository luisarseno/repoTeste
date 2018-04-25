package br.com.gastronomia.testsBO;

import br.com.gastronomia.bo.UsuarioBO;
import br.com.gastronomia.exception.PersistenciaException;
import br.com.gastronomia.exception.ValidationException;
import br.com.gastronomia.model.Usuario;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.assertEquals;

public class TestUsuarioBO {
	UsuarioBO usuario = new UsuarioBO();
    @Test
    public void testCreateUsuario()  throws PersistenciaException, ValidationException {
        Usuario usuarioNovo = new Usuario("030222222222",  "Luis Gustavo Arseno Santana");
        usuarioNovo.setSenha("teste123");
        try {
            boolean usuarioCriado = usuario.createUser(usuarioNovo);
            assertEquals(true, usuarioCriado);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

}

