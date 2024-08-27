package servicio.impl;

import dao.IDao;
import modelo.Nacimiento;
import servicio.INacimientoServicio;

public class NacimientoServicioImpl implements INacimientoServicio {
    private final IDao<Nacimiento> nacimientoLongIDao;

    public NacimientoServicioImpl(IDao<Nacimiento> nacimientoLongIDao) {
        this.nacimientoLongIDao = nacimientoLongIDao;
    }

    @Override
    public Nacimiento agregar(Nacimiento nacimiento) {
        return nacimientoLongIDao.agregar(nacimiento);
    }
}
