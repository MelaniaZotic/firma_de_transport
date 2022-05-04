package Repository;

import Transport.Sofer;

import java.util.Vector;

public class SoferRepository implements RepositoryInterface<Sofer> {
    private static final Vector<Sofer> soferi = new Vector<Sofer>();

    @Override
    public void add(Sofer entity) {
        soferi.add(entity);
    }

    @Override
    public Sofer get(int id) {
        return soferi.get(id);
    }

    @Override
    public void update(int index, Sofer entity) {
        soferi.set(index,entity);
    }

    @Override
    public void delete(int index) {
        soferi.remove(index);
    }

    @Override
    public int getSize() {
        return soferi.size();
    }
}
