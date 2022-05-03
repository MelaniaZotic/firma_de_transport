package Repository;

import Transport.FirmaTransport;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class FirmaRepository implements RepositoryInterface<FirmaTransport>{
    private static final Vector<FirmaTransport> firme = new Vector<FirmaTransport>();

    @Override
    public void add(FirmaTransport entity) {
        firme.add(entity);
    }

    @Override
    public FirmaTransport get(int id) {

        return firme.get(id);
    }

    @Override
    public void update(int index,FirmaTransport entity) {

        firme.set(index,entity);
    }

    @Override
    public void delete(int index) {
        firme.remove(index);
    }

    @Override
    public int getSize() {
        return firme.size();
    }
}
