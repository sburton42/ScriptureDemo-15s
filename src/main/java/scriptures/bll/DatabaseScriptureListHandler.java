/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scriptures.bll;

import java.util.List;
import scriptures.data.MysqlScriptureDao;
import scriptures.data.ScriptureDao;

/**
 *
 * @author sburton
 */
public class DatabaseScriptureListHandler implements ScriptureListHandler {

    @Override
    public List<Scripture> getFavoriteScriptures() {
        ScriptureDao dao = new MysqlScriptureDao();
        
        return dao.getAllScriptures();
    }
    
}
