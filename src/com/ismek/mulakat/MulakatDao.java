package com.ismek.mulakat;

import java.util.List;

import com.ismek.sinav.Sinav;

public interface MulakatDao {

	
	long save(Mulakat mulakat);
    Mulakat get(long id);
    List<Mulakat> list();
    void update(long id, Mulakat Update);
    void delete(long id);

}
