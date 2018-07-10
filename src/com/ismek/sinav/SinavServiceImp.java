package com.ismek.sinav;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SinavServiceImp implements SinavService {
	
	@Autowired
	private SinavDao sinavdao;
	
	@Override
	public long save(Sinav sinav) {
		
		return sinavdao.save(sinav);
	}

	@Override
	public Sinav get(long id) {
	
		return sinavdao.get(id);
	}

	@Override
	public List<Sinav> list() {
		
		return sinavdao.list();
	}

	@Override
	public void update(long id, Sinav sinavUpdate) {
		sinavdao.update(id, sinavUpdate);		
	}

	@Override
	public void delete(long id) {
		sinavdao.delete(id);
		
	}

}
