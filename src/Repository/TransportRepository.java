package Repository;

import Continut.Transport;

import java.util.ArrayList;
import java.util.List;

public class TransportRepository implements RepositoryInterface<Transport> {

   List<Transport> transporturi = new ArrayList<>();
    @Override
    public void add(Transport entity) {
        transporturi.add(entity);
    }

    @Override
    public Transport get(int id) {
        return transporturi.get(id);
    }

    @Override
    public void update(int index, Transport entity) {
        transporturi.set(index,entity);
    }

    @Override
    public void delete(int index) {
        transporturi.remove(index);
    }

    @Override
    public int getSize() {
        return transporturi.size();
    }
}
