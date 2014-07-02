package webapp.storage;

import webapp.model.Resume;

import java.util.Collection;

/**
 * Created by polya_000 on 23/06/2014.
 */
public interface IStorage {

    void create(Resume r);
    void update(Resume r);
    Resume read(String uuid);
    void delete(String uuid);

    Collection<Resume> getAll();

}
