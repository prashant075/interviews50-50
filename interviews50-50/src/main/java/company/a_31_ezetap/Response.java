package company.a_31_ezetap;

import java.util.List;

public class Response {
    private int page;
    private  int per_page;
    private  int total;
    private  int total_pages;
    private List<Country> data;

    public int getPage() {
        return page;
    }

    public Response setPage(int page) {
        this.page = page;
        return this;
    }

    public int getPer_page() {
        return per_page;
    }

    public Response setPer_page(int per_page) {
        this.per_page = per_page;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Response setTotal(int total) {
        this.total = total;
        return this;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public Response setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
        return this;
    }

    public List<Country> getData() {
        return data;
    }

    public Response setData(List<Country> data) {
        this.data = data;
        return this;
    }
}
