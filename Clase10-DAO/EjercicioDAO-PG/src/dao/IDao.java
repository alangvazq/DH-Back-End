package dao;

import java.util.List;

public interface IDao<T> {
    public T registrar(T t);
    public T buscar(Long id);
    public void eliminar(Long id);
    public List<T> buscarTodos();
}
