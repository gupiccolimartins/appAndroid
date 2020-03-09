package com.example.agenda;

import android.app.Application;

import com.example.agenda.dao.AlunoDao;
import com.example.agenda.model.Aluno;

public class AgendaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        criaAlunosDeTeste();
    }

    private void criaAlunosDeTeste() {
        AlunoDao dao = new AlunoDao();
        dao.salva(new Aluno("Gustavo", "3881-2931", "gpiccolimartins@gmail.com"));
        dao.salva(new Aluno("Renata Ingrata", "3881-3325", "renata@gmail.com"));
    }
}
