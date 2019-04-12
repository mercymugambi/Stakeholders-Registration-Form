/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#DrugClassCategoryTableContainer').jtable({
		title : 'Drug Class Category  ',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'DccCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllDrugClassCategoryTableContainer',
			createAction : '/DrugIndex/admin/datatable/addDrugClassCategoryTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updateDrugClassCategoryTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deleteDrugClassCategoryTableContainer'
		},
		fields : {
			DrugClassCategoryId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			DccCode : {
				title : ' Drug Class Category Code',
				width : '10%'
			}
			,
			DrugClassCategory : {
				title : 'Drug Class Category',
				type : 'textarea',
				width : '40%'
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
	$('#DrugClassCategoryTableContainer').jtable('load');

});
