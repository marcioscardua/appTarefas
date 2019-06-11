package com.example.scardua.listadetarefas.helper;

import com.example.scardua.listadetarefas.model.Tarefa;

import java.util.List;

public interface ITarefaDAO {


    public List<Tarefa> listar();
    public boolean salvar(Tarefa tarefa);
    public boolean atualizar(Tarefa tarefa);
    public boolean deletar(Tarefa tarefa);

}
