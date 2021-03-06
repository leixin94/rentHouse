package lx.renthouse.dao;

import java.util.List;

import lx.renthouse.Pojo.Applyout;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApplyoutMapper {
	public void insertapplyout(Applyout applyout);
	List<Applyout> findallapplyout();
	public void updateapplyout(Applyout applyout);
	public void updateapplyoutbyhouse(Applyout applyout);
	public Applyout findbyid(Integer id);
	public void deleteapplyout(Integer id);
}
