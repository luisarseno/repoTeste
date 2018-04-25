package br.com.gastronomia.testsBO;

import br.com.gastronomia.bo.UsuarioBO;
import br.com.gastronomia.exception.PersistenciaException;
import br.com.gastronomia.exception.ValidationException;
import br.com.gastronomia.model.Usuario;
import org.junit.Test;

import java.security.NoSuchAlgorithmException;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class TestUsuarioBO {
	UsuarioBO usuario = new UsuarioBO();
    @Test
    public void testCreateUsuario()  throws PersistenciaException, ValidationException {
        Random random = new Random();
        String cpf = Integer.toString(random.nextInt(99999999));
        Usuario usuarioNovo = new Usuario(cpf,  "Luis Gustavo Arseno Santana");
        usuarioNovo.setSenha("teste123");
        try {
            boolean usuarioCriado = usuario.createUser(usuarioNovo);
            assertEquals(true, usuarioCriado);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

}

