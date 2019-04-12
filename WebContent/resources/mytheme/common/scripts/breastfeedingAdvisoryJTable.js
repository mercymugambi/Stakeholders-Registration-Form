/* 
 * Javascript to manage the JTable
 */

$(document).ready(function() {
	// setup the jtable that will display the results
	$('#BreastfeedingAdvisoryTableContainer').jtable({
		title : 'Breastfeeding Advisory',
		selecting : true, // Enable selecting
		paging : true, // Enable paging
		pageSize : 10, // Set page size (default: 10)
		sorting : true, // Enable sorting
		defaultSorting : 'BreastFeedingAdvisoryCode DESC', // Set default sorting
		actions : {
			listAction : '/DrugIndex/admin/datatable/getAllBreastFeedingAdvisoryTableContainer',
			createAction : '/DrugIndex/admin/datatable/addBreastFeedingAdvisoryTableContainer',
			updateAction : '/DrugIndex/admin/datatable/updateBreastFeedingAdvisoryTableContainer',
			deleteAction : '/DrugIndex/admin/datatable/deleteBreastFeedingAdvisoryTableContainer'
		},
		fields : {
			BreastFeedingAdvisoryId : {
				title : 'ID',
				key : true,
				list : true,
				create : false,
				edit : false
			},
			BreastFeedingAdvisoryCode: {
				title : 'Breastfeeding Advisory Code',
				width : '10%'
			},
			BreastFeedingAdvisory : {
				title : 'Pregnancy Category',
				width : '10%'
			}
			,
			BreastFeedingAdvisory : {
				title : 'Breastfeeding Advisory',
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
	$('#BreastfeedingAdvisoryTableContainer').jtable('load');

});
