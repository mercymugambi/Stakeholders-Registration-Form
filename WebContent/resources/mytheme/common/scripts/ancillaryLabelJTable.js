/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#AncillaryLabelTableContainer').jtable({
		title : 'Ancillary Label',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'AncillaryLabelCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllAncillaryLabelTableContainer',
			createAction : '/DrugIndex/admin/datatable/addAncillaryLabelTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updateAncillaryLabelTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deleteAncillaryLabelTableContainer'
		},
		fields : {
			AncillaryLabelId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			AncillaryLabelNo: {
				title : 'Ancillary Label No',
				width : '10%'
			},
			AncillaryLabelCode: {
				title : 'Ancillary Label Code',
				width : '10%'
			},
			
			
			AncillaryLabel : {
				title : 'Ancillary Label',
				type : 'textarea',
				width : '30%'
			}
			
			
			

		}
	/*
	 * //Register to selectionChanged event to hanlde events recordAdded:
	 * function(event, data){ //after record insertion, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }, recordUpdated:
	 * function(event, data){ //after record updation, reload the records
	 * $('#ExpenseTableContainer').jtable('load'); }
	 */
	});
	/*$('#AncillaryLabelTableContainer').jtable('load');*/

	//Re-load records when user click 'load records' button.
    $('#LoadRecordsButton').click(function (e) {
        e.preventDefault();
        $('#AncillaryLabelTableContainer').jtable('load', {
            name: $('#name').val(),
            AncillaryLabelId: $('#AncillaryLabelId').val()
        });
    });

    //Load all records when page is first shown
    $('#LoadRecordsButton').click();
});

