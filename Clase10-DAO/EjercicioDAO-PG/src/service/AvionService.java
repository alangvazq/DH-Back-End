package service;

import dao.IDao;
import model.Avion;

import java.util.List;

public class AvionService {
    private IDao<Avion> avionIDao;

    // TODO Constructor vacío y setter

    public AvionService(IDao<Avion> avionIDao) {
        this.avionIDao = avionIDao;
    }

    public Avion registrarAvion(Avion avion){
        return avionIDao.registrar(avion);
    }

    public Avion buscarAvion(Long id){
        return avionIDao.buscar(id);
    }

    public void eliminarAvion(Long id){
        avionIDao.eliminar(id);
    }

    public List<Avion> buscarTodosAviones(){
        return avionIDao.buscarTodos();
    }
}
