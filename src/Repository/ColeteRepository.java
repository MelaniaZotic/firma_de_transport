package Repository;

import Continut.Colete;

import java.util.Vector;

public class ColeteRepository implements RepositoryInterface<Colete>{
    private static final Vector<Colete> colete = new Vector<Colete>();

    @Override
    public void add(Colete entity) {
        colete.add(entity);
    }

    @Override
    public Colete get(int id) {
        return colete.get(id);
    }

    @Override
    public void update(int index, Colete entity) {
        colete.set(index,entity);
    }

    @Override
    public void delete(int index) {
        colete.remove(index);
    }

    @Override
    public int getSize() {
        return colete.size();
    }
}
