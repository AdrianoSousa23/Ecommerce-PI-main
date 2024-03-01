package controllers;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Override
    public List<Usuario> listarUsuarios() {
        // Aqui você pode implementar a lógica para obter os usuários do seu sistema
        // Por exemplo, buscar do banco de dados
        List<Usuario> usuarios = new ArrayList<>();
        // Adicione alguns usuários de exemplo para teste
        usuarios.add(new Usuario("João", "joao@example.com", "Ativo"));
        usuarios.add(new Usuario("Maria", "maria@example.com", "Inativo"));
        usuarios.add(new Usuario("Pedro", "pedro@example.com", "Ativo"));
        return usuarios;
    }
}
