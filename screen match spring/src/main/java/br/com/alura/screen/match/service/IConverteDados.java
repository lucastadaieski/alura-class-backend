package br.com.alura.screen.match.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
