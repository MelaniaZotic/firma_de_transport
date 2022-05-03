package Repository;

import Transport.Masina;

import java.util.Vector;

public class MasinaRepository implements RepositoryInterface<Masina>{
    private static final Vector<Masina> masini = new Vector<Masina>();

    @Override
    public void add(Masina entity) {
        masini.add(entity);
    }

    @Override
    public Masina get(int id) {
        return masini.get(id);
    }

    @Override
    public void update(int index, Masina entity) {
        masini.set(index,entity);
    }

    @Override
    public void delete(int index) {
        masini.remove(index);
    }

    @Override
    public int getSize() {
        return masini.size();
    }
}
