package Softtek.Service;

import Softtek.Modelo.autobuses;

import java.util.List;

public interface IAutobusesService {
    autobuses createAutobus(autobuses autobus);
    List<autobuses> getAll();

    autobuses getById(String id);

    void removeAutobus(autobuses autobus);

    autobuses updateAutobus(autobuses autobus);
}
