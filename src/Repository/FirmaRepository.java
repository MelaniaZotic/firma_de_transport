package Repository;

import Transport.FirmaTransport;

import java.util.ArrayList;
import java.util.List;

public class FirmaRepository implements RepositoryInterface<FirmaTransport>{
    List<FirmaTransport> firme = new ArrayList<>();

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
    public void delete(FirmaTransport entity) {

    }

    @Override
    public int getSize() {
        return 1;
    }
}
