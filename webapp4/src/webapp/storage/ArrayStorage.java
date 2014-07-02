package webapp.storage;

import webapp.model.Resume;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ArrayStorage implements IStorage {

    private static final int NUMBER = 100;
    private Resume[] Resumes = new Resume[NUMBER];

    @Override
    public void create(Resume r) {
        //insert in the first not null element
        for (int i = 0; i < NUMBER; i++) {
            if (null == Resumes[i]) {
                Resumes[i] = r;
                break;
            }
        }
        //todo exception
    }

    @Override
    public void update(Resume r) {
        String uuid = r.getUuid();
        for (int i = 0; i < NUMBER; i++) {
            if (Resumes[i] != null &&
                    Resumes[i].getUuid().equals(uuid)) {
                Resumes[i] = r;
                break;
            }
        }
        //todo exception
    }

    @Override
    public Resume read(String uuid) {
        for (int i = 0; i < NUMBER; i++) {
            if (Resumes[i] != null &&
                    Resumes[i].getUuid().equals(uuid)) {
                return Resumes[i];
            }
        }
        // TODO exception
        return null;
    }

    @Override
    public void delete(String uuid) {
        for (int i = 0; i < NUMBER; i++) {
            if (Resumes[i] != null &&
                    Resumes[i].getUuid().equals(uuid)) {
                Resumes[i]=null;
            }
        }

    }

    @Override
    public Collection<Resume> getAll() {
        ArrayList resumes = new ArrayList<Resume>(Arrays.asList(Resumes));
        return resumes;
    }
}
