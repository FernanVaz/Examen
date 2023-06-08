package Softtek.Service;

import Softtek.Modelo.autobuses;
import Softtek.Repo.IAutobusesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AutobusesService implements IAutobusesService{
    @Autowired
    IAutobusesRepo bus;
    @Override
    public autobuses createAutobus(autobuses autobus) {
        return bus.save(autobus);
    }

    @Override
    public List<autobuses> getAll() {
        return bus.findAll();
    }

    @Override
    public autobuses getById(String id) {
        return bus.getById(id);
    }

    @Override
    public void removeAutobus(autobuses autobus) {
        bus.delete(autobus);
    }

    @Override
    public autobuses updateAutobus(autobuses autobus) {
        return bus.save(autobus);
    }
}
