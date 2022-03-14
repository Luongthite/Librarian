/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Admin
 */
public class HTMLHelper {
     public static String hyperlink(String text,String url)
    {
        return "<a class=\"paging_link\" href=\"BookControl"+url+"\" >" +text +  "</a>"+"  ";
    }
    
    public static String label(String text)
    {
        return "<span class=\"paging_label\" >" +text +  "</span>";
    }
    
    public static String pager(int pageSize, int pageindex, int totalpage, String sortSelection)
    {
        String result = "";
        if(pageindex - pageSize > 1)
            result += hyperlink("First", "?page=1"+"&pageSize="+pageSize+"&sortSelection="+sortSelection);
        
        for(int i=pageSize;i>0 ;i--)
        {
            int page = pageindex - i;
            if(page > 0)
                result += hyperlink(""+page, "?page="+page+"&pageSize="+pageSize+"&sortSelection="+sortSelection);
        }
        
        result += label(pageindex+"");
        
        for(int i=1;i<=pageSize ;i++)
        {
            int page = pageindex + i;
            if(page <= totalpage)
                result += hyperlink(""+page, "?page="+page+"&pageSize="+pageSize+"&sortSelection="+sortSelection);
        }
        
        if(pageindex+pageSize < totalpage)
            result += hyperlink("Last", "?page="+totalpage+"&pageSize="+pageSize+"&sortSelection="+sortSelection);
        return result;
    }
    
     public static String hyperlinkAd(String text,String url, String servlet)
    {
        return "<a class=\"paging_link\" href=\""+servlet+url+"\" >" +text +  "</a>"+"  ";
    }
    
    public static String pagerAd(int pageSize, int pageindex, int totalpage, String servlet)
    {
        String result = "";
        if(pageindex - pageSize > 1)
            result += hyperlinkAd("First", "?page=1"+"&pageSize="+pageSize+"&urll="+servlet, servlet);
        
        for(int i=pageSize;i>0 ;i--)
        {
            int page = pageindex - i;
            if(page > 0)
                result += hyperlinkAd(""+page, "?page="+page+"&pageSize="+pageSize+"&urll="+servlet, servlet);
        }
        
        result += label(pageindex+"");
        
        for(int i=1;i<=pageSize ;i++)
        {
            int page = pageindex + i;
            if(page <= totalpage)
                result += hyperlinkAd(""+page, "?page="+page+"&pageSize="+pageSize+"&urll="+servlet, servlet);
        }
        
        if(pageindex+pageSize < totalpage)
            result += hyperlinkAd("Last", "?page="+totalpage+"&pageSize="+pageSize+"&urll="+servlet, servlet);
        return result;
    }
     
     
}
