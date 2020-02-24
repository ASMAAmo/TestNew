package cmps.app.com.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ProjectsModel {
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("total_count")
    @Expose
    private Integer totalCount;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("per_page")
    @Expose
    private Integer perPage;
    @SerializedName("previous_page")
    @Expose
    private Integer previousPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("next_page")
    @Expose
    private Integer nextPage;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("total_projects")
    @Expose
    private Integer totalProjects;
    @SerializedName("total_projects_under_donation")
    @Expose
    private Integer totalProjectsUnderDonation;
    @SerializedName("total_projects_waiting_for_approve")
    @Expose
    private Integer totalProjectsWaitingForApprove;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Integer previousPage) {
        this.previousPage = previousPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Integer getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(Integer totalProjects) {
        this.totalProjects = totalProjects;
    }

    public Integer getTotalProjectsUnderDonation() {
        return totalProjectsUnderDonation;
    }

    public void setTotalProjectsUnderDonation(Integer totalProjectsUnderDonation) {
        this.totalProjectsUnderDonation = totalProjectsUnderDonation;
    }

    public Integer getTotalProjectsWaitingForApprove() {
        return totalProjectsWaitingForApprove;
    }

    public void setTotalProjectsWaitingForApprove(Integer totalProjectsWaitingForApprove) {
        this.totalProjectsWaitingForApprove = totalProjectsWaitingForApprove;
    }


}
