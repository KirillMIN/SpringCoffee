package com.example.springpj.JNDIexample;

import javax.naming.*;
import java.util.Hashtable;

public class JNDIex {
    public static void main(String[] args) throws NamingException {
        Name objectName = new CompositeName("java:comp/env/jdbc");

        //поиск объекта по имени (Object lookup(String name) Object lookup(Name name))
        //Привязка объекта к имени (void bind(Name name, Object obj)void bind(String name, Object obj))
        //отвязка объекта от имени (void unbind(Name name) void unbind(String name))

        //InitialContext — это класс, который представляет из себя корневой элемент JNDI tree и реализует интерфейс Context
        InitialContext context = new InitialContext();
        //или
        Hashtable env = new Hashtable();
        env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
        Context ctx = new InitialContext(env);
    }
}
