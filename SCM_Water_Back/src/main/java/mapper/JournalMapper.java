package mapper;

import pojo.Journal;

public interface JournalMapper {
    int deleteByPrimaryKey(Integer journalid);

    int insert(Journal record);

    int insertSelective(Journal record);

    Journal selectByPrimaryKey(Integer journalid);

    int updateByPrimaryKeySelective(Journal record);

    int updateByPrimaryKey(Journal record);
}